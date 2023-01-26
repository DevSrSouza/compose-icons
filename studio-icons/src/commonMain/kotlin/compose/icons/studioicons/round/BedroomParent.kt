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

public val RoundGroup.BedroomParent: ImageVector
    get() {
        if (_bedroomParent != null) {
            return _bedroomParent!!
        }
        _bedroomParent = Builder(name = "BedroomParent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.0f)
                curveTo(17.5f, 12.45f, 17.05f, 12.0f, 16.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 8.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 8.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
                moveTo(18.25f, 17.0f)
                lineTo(18.25f, 17.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(15.5f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(0.75f)
                curveTo(6.5f, 16.66f, 6.16f, 17.0f, 5.75f, 17.0f)
                horizontalLineToRelative(0.0f)
                curveTo(5.34f, 17.0f, 5.0f, 16.66f, 5.0f, 16.25f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0.0f, -0.66f, 0.25f, -1.26f, 0.65f, -1.72f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineTo(11.0f)
                curveToRelative(0.37f, 0.0f, 0.72f, 0.12f, 1.0f, 0.32f)
                curveTo(12.28f, 7.12f, 12.63f, 7.0f, 13.0f, 7.0f)
                horizontalLineToRelative(3.35f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(2.45f)
                curveToRelative(0.4f, 0.46f, 0.65f, 1.06f, 0.65f, 1.72f)
                verticalLineToRelative(3.08f)
                curveTo(19.0f, 16.66f, 18.66f, 17.0f, 18.25f, 17.0f)
                close()
            }
        }
        .build()
        return _bedroomParent!!
    }

private var _bedroomParent: ImageVector? = null
