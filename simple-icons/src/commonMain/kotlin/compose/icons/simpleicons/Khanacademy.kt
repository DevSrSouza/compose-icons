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

public val SimpleIcons.Khanacademy: ImageVector
    get() {
        if (_khanacademy != null) {
            return _khanacademy!!
        }
        _khanacademy = Builder(name = "Khanacademy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.724f, 4.973f)
                lineTo(13.418f, 0.328f)
                arcToRelative(3.214f, 3.214f, 0.0f, false, false, -2.828f, 0.0f)
                lineTo(2.276f, 4.973f)
                arcTo(3.05f, 3.05f, 0.0f, false, false, 0.862f, 7.371f)
                verticalLineToRelative(9.256f)
                arcToRelative(3.05f, 3.05f, 0.0f, false, false, 1.414f, 2.4f)
                lineToRelative(8.306f, 4.645f)
                arcToRelative(3.214f, 3.214f, 0.0f, false, false, 2.828f, 0.0f)
                lineToRelative(8.314f, -4.645f)
                arcToRelative(3.05f, 3.05f, 0.0f, false, false, 1.414f, -2.4f)
                lineTo(23.138f, 7.373f)
                arcToRelative(3.05f, 3.05f, 0.0f, false, false, -1.414f, -2.4f)
                close()
                moveTo(12.0f, 4.921f)
                arcToRelative(2.571f, 2.571f, 0.0f, true, true, 0.001f, 5.143f)
                arcTo(2.571f, 2.571f, 0.0f, false, true, 12.0f, 4.92f)
                close()
                moveTo(15.094f, 18.548f)
                arcToRelative(9.119f, 9.119f, 0.0f, false, true, -3.103f, 0.549f)
                arcToRelative(8.972f, 8.972f, 0.0f, false, true, -3.076f, -0.55f)
                arcToRelative(8.493f, 8.493f, 0.0f, false, true, -5.486f, -7.987f)
                verticalLineToRelative(-0.857f)
                curveToRelative(4.646f, 0.017f, 8.074f, 3.823f, 8.074f, 8.51f)
                verticalLineToRelative(0.198f)
                horizontalLineToRelative(0.926f)
                verticalLineToRelative(-0.197f)
                curveToRelative(0.0f, -4.688f, 3.445f, -8.51f, 8.056f, -8.51f)
                curveToRelative(0.026f, 0.29f, 0.043f, 0.582f, 0.086f, 0.856f)
                arcToRelative(8.502f, 8.502f, 0.0f, false, true, -5.477f, 7.988f)
                close()
            }
        }
        .build()
        return _khanacademy!!
    }

private var _khanacademy: ImageVector? = null
