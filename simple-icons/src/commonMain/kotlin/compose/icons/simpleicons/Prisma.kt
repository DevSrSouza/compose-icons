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

public val SimpleIcons.Prisma: ImageVector
    get() {
        if (_prisma != null) {
            return _prisma!!
        }
        _prisma = Builder(name = "Prisma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.807f, 18.285f)
                lineTo(13.553f, 0.757f)
                curveToRelative(-0.207f, -0.438f, -0.639f, -0.727f, -1.129f, -0.754f)
                curveToRelative(-0.502f, -0.029f, -0.952f, 0.213f, -1.206f, 0.625f)
                lineTo(2.266f, 15.127f)
                curveToRelative(-0.277f, 0.452f, -0.272f, 1.009f, 0.016f, 1.456f)
                lineToRelative(4.376f, 6.779f)
                curveToRelative(0.261f, 0.405f, 0.713f, 0.639f, 1.182f, 0.639f)
                curveToRelative(0.133f, 0.0f, 0.267f, -0.019f, 0.399f, -0.058f)
                lineToRelative(12.702f, -3.757f)
                curveToRelative(0.389f, -0.115f, 0.707f, -0.39f, 0.874f, -0.755f)
                reflectiveCurveToRelative(0.163f, -0.783f, -0.007f, -1.145f)
                close()
                moveTo(19.959f, 19.037f)
                lineTo(9.181f, 22.224f)
                curveToRelative(-0.329f, 0.097f, -0.645f, -0.187f, -0.576f, -0.519f)
                lineToRelative(3.85f, -18.439f)
                curveToRelative(0.072f, -0.345f, 0.549f, -0.4f, 0.699f, -0.08f)
                lineToRelative(7.129f, 15.138f)
                curveToRelative(0.134f, 0.286f, -0.019f, 0.622f, -0.325f, 0.713f)
                close()
            }
        }
        .build()
        return _prisma!!
    }

private var _prisma: ImageVector? = null
