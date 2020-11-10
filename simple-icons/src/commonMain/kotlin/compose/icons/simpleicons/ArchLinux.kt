package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.ArchLinux: VectorAsset
    get() {
        if (_archLinux != null) {
            return _archLinux!!
        }
        _archLinux = VectorAssetBuilder(name = "ArchLinux", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3902f, 0.6051f)
                curveTo(10.3757f, 3.0917f, 9.7643f, 4.7185f, 8.6351f, 7.1316f)
                curveToRelative(0.6927f, 0.7347f, 1.5429f, 1.5892f, 2.923f, 2.5539f)
                curveToRelative(-1.4843f, -0.6105f, -2.4962f, -1.2236f, -3.2528f, -1.8595f)
                curveToRelative(-1.4449f, 3.0157f, -3.7102f, 7.312f, -8.3055f, 15.5685f)
                curveToRelative(3.6122f, -2.0851f, 6.412f, -3.37f, 9.021f, -3.8615f)
                curveToRelative(-0.112f, -0.4811f, -0.1758f, -1.0032f, -0.1714f, -1.5472f)
                lineToRelative(0.0035f, -0.1155f)
                curveToRelative(0.0577f, -2.3143f, 1.2612f, -4.0942f, 2.6869f, -3.9726f)
                curveToRelative(1.4257f, 0.1198f, 2.5338f, 2.0956f, 2.4778f, 4.409f)
                curveToRelative(-0.0105f, 0.4356f, -0.0604f, 0.8545f, -0.1461f, 1.2429f)
                curveToRelative(2.581f, 0.5047f, 5.3519f, 1.7869f, 8.9143f, 3.844f)
                curveToRelative(-0.7023f, -1.2927f, -1.3294f, -2.4586f, -1.9286f, -3.5694f)
                curveToRelative(-0.9437f, -0.7312f, -1.9268f, -1.6828f, -3.9332f, -2.7131f)
                curveToRelative(1.3793f, 0.3586f, 2.3668f, 0.7714f, 3.1364f, 1.2341f)
                curveTo(13.9704f, 7.0109f, 13.4789f, 5.5039f, 11.3902f, 0.6051f)
                close()
                moveTo(22.8978f, 21.3602f)
                verticalLineToRelative(-0.6236f)
                horizontalLineToRelative(-0.2335f)
                verticalLineToRelative(-0.084f)
                horizontalLineToRelative(0.5615f)
                verticalLineToRelative(0.084f)
                horizontalLineToRelative(-0.2344f)
                verticalLineToRelative(0.6236f)
                horizontalLineToRelative(-0.0936f)
                moveTo(23.3229f, 21.3602f)
                verticalLineToRelative(-0.7076f)
                horizontalLineToRelative(0.1417f)
                lineToRelative(0.1671f, 0.5012f)
                curveToRelative(0.0157f, 0.0472f, 0.0271f, 0.0822f, 0.0341f, 0.1058f)
                curveToRelative(0.0079f, -0.0254f, 0.0201f, -0.0639f, 0.0385f, -0.1137f)
                lineToRelative(0.1688f, -0.4933f)
                horizontalLineToRelative(0.1268f)
                verticalLineToRelative(0.7076f)
                horizontalLineToRelative(-0.091f)
                verticalLineToRelative(-0.593f)
                lineToRelative(-0.2064f, 0.593f)
                horizontalLineToRelative(-0.084f)
                lineToRelative(-0.2047f, -0.6026f)
                verticalLineToRelative(0.6026f)
                horizontalLineToRelative(-0.091f)
            }
        }
        .build()
        return _archLinux!!
    }

private var _archLinux: VectorAsset? = null
