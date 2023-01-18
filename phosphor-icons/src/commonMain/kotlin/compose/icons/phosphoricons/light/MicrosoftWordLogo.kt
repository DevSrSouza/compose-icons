package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) {
            return _microsoftWordLogo!!
        }
        _microsoftWordLogo = Builder(name = "MicrosoftWordLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 26.0f)
                lineTo(72.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 58.0f, 40.0f)
                lineTo(58.0f, 66.0f)
                lineTo(40.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(58.0f, 190.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 26.0f)
                close()
                moveTo(158.0f, 102.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(52.0f)
                lineTo(158.0f, 154.0f)
                close()
                moveTo(70.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(200.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(202.0f, 90.0f)
                lineTo(158.0f, 90.0f)
                lineTo(158.0f, 80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(70.0f, 66.0f)
                close()
                moveTo(38.0f, 176.0f)
                lineTo(38.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(144.0f, 78.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 178.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 176.0f)
                close()
                moveTo(200.0f, 218.0f)
                lineTo(72.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(70.0f, 190.0f)
                horizontalLineToRelative(74.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(158.0f, 166.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(50.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 200.0f, 218.0f)
                close()
                moveTo(70.2f, 153.5f)
                lineToRelative(-12.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.6f, -3.0f)
                lineToRelative(7.8f, 31.1f)
                lineToRelative(8.9f, -20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.0f, 0.0f)
                lineToRelative(8.9f, 20.0f)
                lineToRelative(7.8f, -31.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.6f, 3.0f)
                lineToRelative(-12.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.3f, 4.5f)
                lineTo(108.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.5f, -3.6f)
                lineTo(92.0f, 130.8f)
                lineTo(81.5f, 154.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -6.0f, 3.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 70.2f, 153.5f)
                close()
            }
        }
        .build()
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
