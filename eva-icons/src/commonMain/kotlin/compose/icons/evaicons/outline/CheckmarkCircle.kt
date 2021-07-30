package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.CheckmarkCircle: ImageVector
    get() {
        if (_checkmarkCircle != null) {
            return _checkmarkCircle!!
        }
        _checkmarkCircle = Builder(name = "CheckmarkCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.71f, 11.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.42f)
                lineToRelative(3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 16.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.72f, -0.34f)
                lineToRelative(7.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.5f, -1.32f)
                lineTo(12.0f, 13.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 6.33f, 6.36f)
                arcTo(7.93f, 7.93f, 0.0f, false, true, 12.0f, 4.0f)
                arcToRelative(8.79f, 8.79f, 0.0f, false, true, 1.9f, 0.22f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.47f, -1.94f)
                arcTo(10.54f, 10.54f, 0.0f, false, false, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 5.0f, 19.09f)
                arcTo(9.93f, 9.93f, 0.0f, false, false, 12.0f, 22.0f)
                horizontalLineToRelative(0.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 11.0f)
                close()
            }
        }
        .build()
        return _checkmarkCircle!!
    }

private var _checkmarkCircle: ImageVector? = null
