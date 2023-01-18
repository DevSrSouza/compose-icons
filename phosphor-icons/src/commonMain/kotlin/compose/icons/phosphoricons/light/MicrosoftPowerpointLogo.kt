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

public val LightGroup.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) {
            return _microsoftPowerpointLogo!!
        }
        _microsoftPowerpointLogo = Builder(name = "MicrosoftPowerpointLogo", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 98.0f)
                lineTo(78.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(84.0f, 142.0f)
                lineTo(94.0f, 142.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                close()
                moveTo(94.0f, 130.0f)
                lineTo(84.0f, 130.0f)
                lineTo(84.0f, 110.0f)
                lineTo(94.0f, 110.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                close()
                moveTo(136.0f, 26.0f)
                arcTo(102.4f, 102.4f, 0.0f, false, false, 55.0f, 66.0f)
                lineTo(40.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(55.0f, 190.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 136.0f, 26.0f)
                close()
                moveTo(225.8f, 122.0f)
                lineTo(158.0f, 122.0f)
                lineTo(158.0f, 80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(142.0f, 38.2f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 225.8f, 122.0f)
                close()
                moveTo(130.0f, 38.2f)
                lineTo(130.0f, 66.0f)
                lineTo(70.8f, 66.0f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 130.0f, 38.2f)
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
                moveTo(70.8f, 190.0f)
                lineTo(130.0f, 190.0f)
                verticalLineToRelative(27.8f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 70.8f, 190.0f)
                close()
                moveTo(142.0f, 217.8f)
                lineTo(142.0f, 190.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(158.0f, 134.0f)
                horizontalLineToRelative(67.8f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 142.0f, 217.8f)
                close()
            }
        }
        .build()
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
