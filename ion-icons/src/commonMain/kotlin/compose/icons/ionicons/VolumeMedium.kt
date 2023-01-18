package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.VolumeMedium: ImageVector
    get() {
        if (_volumeMedium != null) {
            return _volumeMedium!!
        }
        _volumeMedium = Builder(name = "VolumeMedium", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(264.0f, 416.19f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, true, -14.21f, -4.69f)
                lineToRelative(-0.66f, -0.51f)
                lineToRelative(-91.46f, -75.0f)
                horizontalLineTo(88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(69.65f)
                lineToRelative(91.46f, -75.0f)
                lineToRelative(0.66f, -0.51f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 288.0f, 119.83f)
                verticalLineTo(392.17f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -14.29f, -23.18f)
                curveToRelative(9.49f, -18.9f, 14.3f, -38.0f, 14.3f, -56.82f)
                curveToRelative(0.0f, -19.36f, -4.66f, -37.92f, -14.25f, -56.73f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 28.5f, -14.54f)
                curveTo(378.2f, 208.16f, 384.0f, 231.47f, 384.0f, 256.0f)
                curveToRelative(0.0f, 23.83f, -6.0f, 47.78f, -17.7f, 71.18f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 352.0f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 384.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.87f, -24.0f)
                curveTo(405.0f, 327.05f, 416.0f, 299.45f, 416.0f, 256.0f)
                curveToRelative(0.0f, -44.12f, -10.94f, -71.52f, -29.83f, -103.95f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 413.83f, 136.0f)
                curveTo(434.92f, 172.16f, 448.0f, 204.88f, 448.0f, 256.0f)
                curveToRelative(0.0f, 50.36f, -13.06f, 83.24f, -34.12f, 120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 400.0f, 384.0f)
                close()
            }
        }
        .build()
        return _volumeMedium!!
    }

private var _volumeMedium: ImageVector? = null
