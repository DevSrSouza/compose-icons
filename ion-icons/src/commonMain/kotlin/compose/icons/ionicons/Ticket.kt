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

public val IonIcons.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.18f, 181.4f)
                lineToRelative(-44.13f, -44.13f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -27.0f, -1.0f)
                arcToRelative(30.81f, 30.81f, 0.0f, false, true, -41.68f, -1.6f)
                horizontalLineToRelative(0.0f)
                arcTo(30.81f, 30.81f, 0.0f, false, true, 375.77f, 93.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.0f, -27.0f)
                lineTo(330.6f, 21.82f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -28.13f, 0.0f)
                lineTo(232.12f, 92.16f)
                arcToRelative(39.87f, 39.87f, 0.0f, false, false, -9.57f, 15.5f)
                arcToRelative(7.71f, 7.71f, 0.0f, false, true, -4.83f, 4.83f)
                arcToRelative(39.78f, 39.78f, 0.0f, false, false, -15.5f, 9.58f)
                lineTo(21.82f, 302.47f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, 0.0f, 28.13f)
                lineTo(66.0f, 374.73f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 27.0f, 1.0f)
                arcToRelative(30.69f, 30.69f, 0.0f, false, true, 43.28f, 43.28f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.0f, 27.0f)
                lineToRelative(44.13f, 44.13f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, 28.13f, 0.0f)
                lineToRelative(180.4f, -180.4f)
                arcToRelative(39.82f, 39.82f, 0.0f, false, false, 9.58f, -15.49f)
                arcToRelative(7.69f, 7.69f, 0.0f, false, true, 4.84f, -4.84f)
                arcToRelative(39.84f, 39.84f, 0.0f, false, false, 15.49f, -9.57f)
                lineToRelative(70.34f, -70.35f)
                arcTo(19.91f, 19.91f, 0.0f, false, false, 490.18f, 181.4f)
                close()
                moveTo(261.81f, 151.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, 0.0f)
                lineToRelative(-11.51f, -11.51f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, -22.62f)
                lineToRelative(11.51f, 11.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 261.81f, 151.75f)
                close()
                moveTo(305.81f, 195.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f)
                lineToRelative(-11.0f, -11.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.63f, -22.63f)
                lineToRelative(11.0f, 11.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 305.83f, 195.78f)
                close()
                moveTo(349.81f, 239.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, 0.0f)
                lineToRelative(-11.0f, -11.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, -22.62f)
                lineToRelative(11.0f, 11.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 349.86f, 239.8f)
                close()
                moveTo(394.24f, 284.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, 0.0f)
                lineToRelative(-11.44f, -11.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.68f, -22.57f)
                lineToRelative(11.45f, 11.49f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 394.29f, 284.34f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
