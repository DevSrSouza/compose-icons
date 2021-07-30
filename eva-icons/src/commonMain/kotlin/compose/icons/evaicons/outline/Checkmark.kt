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

public val OutlineGroup.Checkmark: ImageVector
    get() {
        if (_checkmark != null) {
            return _checkmark!!
        }
        _checkmark = Builder(name = "Checkmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(9.86f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.73f, -0.32f)
                lineTo(4.27f, 12.51f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.46f, -1.37f)
                lineToRelative(4.12f, 4.39f)
                lineToRelative(8.41f, -9.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.48f, 1.34f)
                lineToRelative(-9.14f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.73f, 0.33f)
                close()
            }
        }
        .build()
        return _checkmark!!
    }

private var _checkmark: ImageVector? = null
