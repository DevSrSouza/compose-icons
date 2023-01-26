package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9f, 7.89f)
                lineToRelative(-1.05f, -3.37f)
                curveToRelative(-0.22f, -0.9f, -1.0f, -1.52f, -1.91f, -1.52f)
                horizontalLineTo(5.05f)
                curveToRelative(-0.9f, 0.0f, -1.69f, 0.63f, -1.9f, 1.52f)
                lineTo(2.1f, 7.89f)
                curveTo(1.64f, 9.86f, 2.95f, 11.0f, 3.0f, 11.06f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-7.94f)
                curveTo(22.12f, 9.94f, 22.09f, 8.65f, 21.9f, 7.89f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(1.96f)
                lineToRelative(0.54f, 3.52f)
                curveTo(15.59f, 9.23f, 15.11f, 10.0f, 14.22f, 10.0f)
                curveTo(13.55f, 10.0f, 13.0f, 9.41f, 13.0f, 8.69f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.44f, 8.86f)
                curveTo(6.36f, 9.51f, 5.84f, 10.0f, 5.23f, 10.0f)
                curveTo(4.3f, 10.0f, 3.88f, 9.03f, 4.04f, 8.36f)
                lineTo(5.05f, 5.0f)
                horizontalLineToRelative(1.97f)
                lineTo(6.44f, 8.86f)
                close()
                moveTo(11.0f, 8.69f)
                curveTo(11.0f, 9.41f, 10.45f, 10.0f, 9.71f, 10.0f)
                curveToRelative(-0.75f, 0.0f, -1.3f, -0.7f, -1.22f, -1.48f)
                lineTo(9.04f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.69f)
                close()
                moveTo(18.77f, 10.0f)
                curveToRelative(-0.61f, 0.0f, -1.14f, -0.49f, -1.21f, -1.14f)
                lineTo(16.98f, 5.0f)
                lineToRelative(1.93f, -0.01f)
                lineToRelative(1.05f, 3.37f)
                curveTo(20.12f, 9.03f, 19.71f, 10.0f, 18.77f, 10.0f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
