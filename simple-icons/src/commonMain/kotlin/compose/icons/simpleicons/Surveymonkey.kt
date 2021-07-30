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

public val SimpleIcons.Surveymonkey: ImageVector
    get() {
        if (_surveymonkey != null) {
            return _surveymonkey!!
        }
        _surveymonkey = Builder(name = "Surveymonkey", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.1627f, 13.1843f)
                arcToRelative(2.8517f, 2.8517f, 0.0f, false, false, -0.6778f, 0.0841f)
                curveToRelative(-0.8438f, -3.3181f, -3.5478f, -5.8376f, -6.9172f, -6.4452f)
                arcToRelative(8.3933f, 8.3933f, 0.0f, false, false, -0.4407f, -0.0668f)
                curveToRelative(0.0259f, -0.8255f, 0.0636f, -1.7791f, 1.2781f, -2.6369f)
                lineToRelative(-0.1918f, -0.4838f)
                reflectiveCurveToRelative(-2.3708f, 0.7349f, -2.6391f, 2.7598f)
                curveToRelative(-0.1175f, -0.5507f, -1.2209f, -1.2403f, -1.7673f, -1.3707f)
                lineToRelative(-0.2717f, 0.4384f)
                reflectiveCurveToRelative(0.7242f, 0.3621f, 0.9009f, 1.361f)
                curveToRelative(-3.3691f, 0.6056f, -6.0743f, 3.1229f, -6.9204f, 6.4398f)
                curveToRelative(-1.5194f, -0.376f, -3.056f, 0.5508f, -3.432f, 2.0703f)
                curveToRelative(-0.376f, 1.5194f, 0.5508f, 3.056f, 2.0703f, 3.432f)
                arcToRelative(2.8346f, 2.8346f, 0.0f, false, false, 1.7195f, -0.1142f)
                arcToRelative(8.6821f, 8.6821f, 0.0f, false, false, 0.9203f, 1.7123f)
                lineToRelative(2.3524f, -1.5852f)
                curveToRelative(-0.6381f, -0.8071f, -1.0206f, -1.9884f, -1.0873f, -3.1736f)
                curveToRelative(-0.07f, -1.2931f, 0.2446f, -2.5755f, 1.0701f, -3.3298f)
                curveToRelative(1.7016f, -1.4483f, 3.5561f, -0.7877f, 4.7135f, 0.6002f)
                horizontalLineToRelative(0.3114f)
                curveToRelative(1.1606f, -1.388f, 3.0173f, -2.0475f, 4.7135f, -0.6002f)
                curveToRelative(0.8244f, 0.7543f, 1.1401f, 2.0378f, 1.0701f, 3.3298f)
                curveToRelative(-0.0656f, 1.1853f, -0.4481f, 2.3664f, -1.0873f, 3.1736f)
                lineToRelative(2.3524f, 1.5852f)
                arcToRelative(8.6854f, 8.6854f, 0.0f, false, false, 0.9224f, -1.7123f)
                curveToRelative(1.4551f, 0.5751f, 3.1009f, -0.1384f, 3.676f, -1.5935f)
                reflectiveCurveToRelative(-0.1384f, -3.1009f, -1.5935f, -3.676f)
                arcToRelative(2.8349f, 2.8349f, 0.0f, false, false, -1.0448f, -0.1983f)
                close()
                moveTo(2.7861f, 16.8482f)
                arcToRelative(0.8362f, 0.8362f, 0.0f, false, true, 0.0f, -1.6724f)
                arcToRelative(0.8442f, 0.8442f, 0.0f, false, true, 0.4688f, 0.1444f)
                curveToRelative(0.0071f, 0.4391f, 0.0369f, 0.8776f, 0.0894f, 1.3136f)
                curveToRelative(-0.1472f, 0.1346f, -0.3738f, 0.2329f, -0.5582f, 0.2144f)
                close()
                moveTo(21.2134f, 16.8482f)
                arcToRelative(0.8361f, 0.8361f, 0.0f, false, true, -0.5582f, -0.2155f)
                arcToRelative(12.679f, 12.679f, 0.0f, false, false, 0.0894f, -1.3136f)
                arcToRelative(0.8352f, 0.8352f, 0.0f, false, true, 1.304f, 0.6929f)
                curveToRelative(0.0078f, 0.4574f, -0.3823f, 0.8581f, -0.8352f, 0.8362f)
                close()
            }
        }
        .build()
        return _surveymonkey!!
    }

private var _surveymonkey: ImageVector? = null
