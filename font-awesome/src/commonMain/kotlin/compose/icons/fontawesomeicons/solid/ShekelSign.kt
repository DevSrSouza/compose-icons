package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ShekelSign: ImageVector
    get() {
        if (_shekelSign != null) {
            return _shekelSign!!
        }
        _shekelSign = Builder(name = "ShekelSign", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 168.0f)
                verticalLineToRelative(168.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineTo(168.0f)
                curveToRelative(0.0f, -75.11f, -60.89f, -136.0f, -136.0f, -136.0f)
                horizontalLineTo(24.0f)
                curveTo(10.75f, 32.0f, 0.0f, 42.74f, 0.0f, 56.0f)
                verticalLineToRelative(408.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineTo(112.0f)
                horizontalLineToRelative(112.0f)
                curveToRelative(30.93f, 0.0f, 56.0f, 25.07f, 56.0f, 56.0f)
                close()
                moveTo(432.0f, 32.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(296.0f)
                curveToRelative(0.0f, 30.93f, -25.07f, 56.0f, -56.0f, 56.0f)
                horizontalLineTo(200.0f)
                verticalLineTo(176.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(280.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(168.0f)
                curveToRelative(75.11f, 0.0f, 136.0f, -60.89f, 136.0f, -136.0f)
                verticalLineTo(48.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _shekelSign!!
    }

private var _shekelSign: ImageVector? = null
