package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ExtensionOff: ImageVector
    get() {
        if (_extensionOff != null) {
            return _extensionOff!!
        }
        _extensionOff = Builder(name = "ExtensionOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 4.22f)
                lineToRelative(1.62f, 1.62f)
                curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.01f, 0.16f)
                verticalLineToRelative(3.8f)
                curveTo(5.7f, 9.8f, 6.0f, 11.96f, 6.0f, 12.5f)
                curveToRelative(0.0f, 0.54f, -0.29f, 2.7f, -3.0f, 2.7f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.8f)
                curveToRelative(0.0f, -2.71f, 2.16f, -3.0f, 2.7f, -3.0f)
                curveToRelative(0.54f, 0.0f, 2.7f, 0.29f, 2.7f, 3.0f)
                horizontalLineTo(18.0f)
                curveToRelative(0.06f, 0.0f, 0.11f, 0.0f, 0.16f, -0.01f)
                lineToRelative(1.61f, 1.61f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
                moveTo(11.5f, 16.0f)
                curveToRelative(-1.5f, 0.0f, -3.57f, 0.83f, -4.37f, 3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.13f)
                curveToRelative(2.17f, -0.8f, 3.0f, -2.87f, 3.0f, -4.37f)
                curveToRelative(0.0f, -0.69f, -0.18f, -1.5f, -0.58f, -2.25f)
                lineToRelative(6.33f, 6.33f)
                curveTo(13.0f, 16.18f, 12.19f, 16.0f, 11.5f, 16.0f)
                close()
                moveTo(8.83f, 6.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(9.0f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveTo(14.0f, 2.62f, 14.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(21.38f, 15.0f, 20.0f, 15.0f)
                verticalLineToRelative(2.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(20.28f, 12.0f, 20.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveTo(11.0f, 3.72f, 11.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.83f)
                close()
            }
        }
        .build()
        return _extensionOff!!
    }

private var _extensionOff: ImageVector? = null
