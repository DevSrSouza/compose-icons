package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Fraunhofergesellschaft: ImageVector
    get() {
        if (_fraunhofergesellschaft != null) {
            return _fraunhofergesellschaft!!
        }
        _fraunhofergesellschaft = Builder(name = "Fraunhofergesellschaft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.06f, 23.99f)
                curveToRelative(5.681f, -2.926f, 14.0f, -7.653f, 23.88f, -14.567f)
                verticalLineToRelative(-2.32f)
                curveTo(15.247f, 12.792f, 6.406f, 17.359f, 0.06f, 20.38f)
                close()
                moveTo(0.06f, 17.06f)
                curveToRelative(6.325f, -2.575f, 15.166f, -6.558f, 23.88f, -11.74f)
                lineTo(23.94f, 4.174f)
                curveTo(15.751f, 8.238f, 7.24f, 10.781f, 0.06f, 12.366f)
                close()
                moveTo(23.94f, 24.0f)
                lineTo(23.94f, 12.332f)
                arcTo(201.394f, 201.393f, 0.0f, false, true, 8.596f, 24.0f)
                close()
                moveTo(5.542f, 24.0f)
                arcToRelative(166.927f, 166.926f, 0.0f, false, false, 14.7f, -9.765f)
                arcToRelative(323.136f, 324.76f, 0.0f, false, false, 3.698f, -2.81f)
                lineTo(23.94f, 9.98f)
                curveTo(16.257f, 15.74f, 8.413f, 20.542f, 2.287f, 24.0f)
                close()
                moveTo(0.06f, 10.668f)
                curveTo(7.044f, 9.44f, 15.589f, 7.231f, 23.94f, 3.262f)
                verticalLineToRelative(-1.3f)
                curveTo(15.526f, 5.737f, 7.102f, 7.338f, 0.06f, 7.91f)
                close()
                moveTo(0.06f, 0.0f)
                verticalLineToRelative(6.686f)
                curveToRelative(0.522f, -0.033f, 1.054f, -0.07f, 1.596f, -0.111f)
                curveTo(7.464f, 6.126f, 15.387f, 5.1f, 23.94f, 1.402f)
                lineTo(23.94f, 0.0f)
                close()
            }
        }
        .build()
        return _fraunhofergesellschaft!!
    }

private var _fraunhofergesellschaft: ImageVector? = null
