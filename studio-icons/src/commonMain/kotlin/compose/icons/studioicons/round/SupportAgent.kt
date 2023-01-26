package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SupportAgent: ImageVector
    get() {
        if (_supportAgent != null) {
            return _supportAgent!!
        }
        _supportAgent = Builder(name = "SupportAgent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.22f)
                curveTo(21.0f, 6.73f, 16.74f, 3.0f, 12.0f, 3.0f)
                curveToRelative(-4.69f, 0.0f, -9.0f, 3.65f, -9.0f, 9.28f)
                curveTo(2.4f, 12.62f, 2.0f, 13.26f, 2.0f, 14.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineToRelative(0.0f, -4.81f)
                curveToRelative(0.0f, -3.83f, 2.95f, -7.18f, 6.78f, -7.29f)
                curveToRelative(3.96f, -0.12f, 7.22f, 3.06f, 7.22f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-1.22f)
                curveToRelative(0.59f, -0.31f, 1.0f, -0.92f, 1.0f, -1.64f)
                verticalLineToRelative(-2.3f)
                curveTo(22.0f, 13.14f, 21.59f, 12.53f, 21.0f, 12.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.03f)
                curveTo(17.52f, 8.18f, 15.04f, 6.0f, 12.05f, 6.0f)
                curveToRelative(-3.03f, 0.0f, -6.29f, 2.51f, -6.03f, 6.45f)
                curveToRelative(2.47f, -1.01f, 4.33f, -3.21f, 4.86f, -5.89f)
                curveTo(12.19f, 9.19f, 14.88f, 11.0f, 18.0f, 11.03f)
                close()
            }
        }
        .build()
        return _supportAgent!!
    }

private var _supportAgent: ImageVector? = null
