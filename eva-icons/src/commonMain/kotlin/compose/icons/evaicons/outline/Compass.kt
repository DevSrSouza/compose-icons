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

public val OutlineGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.68f, 8.32f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.1f, -0.25f)
                lineToRelative(-4.21f, 1.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.55f, 0.55f)
                lineTo(8.07f, 14.58f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.18f, 1.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.05f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.38f, -0.07f)
                lineToRelative(4.21f, -1.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.55f, -0.55f)
                lineToRelative(1.75f, -4.26f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.68f, 8.32f)
                close()
                moveTo(10.8f, 13.21f)
                lineToRelative(0.71f, -1.74f)
                lineToRelative(1.69f, -0.68f)
                lineToRelative(-0.71f, 1.74f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
