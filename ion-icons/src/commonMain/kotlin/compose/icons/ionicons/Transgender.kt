package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Transgender: ImageVector
    get() {
        if (_transgender != null) {
            return _transgender!!
        }
        _transgender = Builder(name = "Transgender", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(458.0f, 32.0f)
                horizontalLineTo(390.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f)
                horizontalLineToRelative(14.89f)
                lineToRelative(-59.57f, 59.57f)
                arcToRelative(149.69f, 149.69f, 0.0f, false, false, -178.64f, 0.0f)
                lineTo(159.11f, 128.0f)
                lineToRelative(26.45f, -26.44f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -31.12f, -31.12f)
                lineTo(128.0f, 96.89f)
                lineTo(107.11f, 76.0f)
                horizontalLineTo(122.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                horizontalLineTo(54.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 32.0f, 54.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                verticalLineTo(107.11f)
                lineTo(96.89f, 128.0f)
                lineTo(70.47f, 154.42f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 31.11f, 31.11f)
                lineTo(128.0f, 159.11f)
                lineToRelative(7.57f, 7.57f)
                arcTo(149.19f, 149.19f, 0.0f, false, false, 106.0f, 256.0f)
                curveToRelative(0.0f, 82.71f, 67.29f, 150.0f, 150.0f, 150.0f)
                arcToRelative(149.2f, 149.2f, 0.0f, false, false, 89.46f, -29.67f)
                lineTo(369.0f, 399.9f)
                lineToRelative(-26.54f, 26.54f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 31.12f, 31.12f)
                lineToRelative(26.49f, -26.5f)
                lineToRelative(42.37f, 42.48f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 31.16f, -31.08f)
                lineTo(431.17f, 400.0f)
                lineToRelative(26.39f, -26.39f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -31.12f, -31.12f)
                lineToRelative(-26.35f, 26.35f)
                lineToRelative(-23.55f, -23.62f)
                arcToRelative(149.68f, 149.68f, 0.0f, false, false, -0.11f, -178.49f)
                lineTo(436.0f, 107.11f)
                verticalLineTo(122.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                verticalLineTo(54.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 458.0f, 32.0f)
                close()
                moveTo(150.0f, 256.0f)
                arcTo(106.0f, 106.0f, 0.0f, true, true, 256.0f, 362.0f)
                arcTo(106.12f, 106.12f, 0.0f, false, true, 150.0f, 256.0f)
                close()
            }
        }
        .build()
        return _transgender!!
    }

private var _transgender: ImageVector? = null
