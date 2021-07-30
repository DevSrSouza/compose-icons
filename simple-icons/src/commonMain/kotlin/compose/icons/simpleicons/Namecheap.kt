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

public val SimpleIcons.Namecheap: ImageVector
    get() {
        if (_namecheap != null) {
            return _namecheap!!
        }
        _namecheap = Builder(name = "Namecheap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.295f, 17.484f)
                curveToRelative(0.227f, 0.403f, 0.57f, 0.728f, 0.985f, 0.931f)
                curveToRelative(-0.309f, 0.15f, -0.647f, 0.229f, -0.99f, 0.232f)
                horizontalLineToRelative(-3.068f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, true, -1.957f, -1.143f)
                lineTo(6.705f, 6.511f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, false, -0.974f, -0.922f)
                curveToRelative(0.309f, -0.153f, 0.652f, -0.233f, 0.997f, -0.232f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.81f, 0.003f, 1.558f, 0.438f, 1.959f, 1.143f)
                lineToRelative(5.558f, 10.984f)
                close()
                moveTo(7.966f, 10.092f)
                lineTo(6.269f, 6.755f)
                curveToRelative(-0.209f, -0.392f, -0.582f, -0.657f, -0.984f, -0.829f)
                curveToRelative(-0.204f, 0.165f, -0.391f, 0.35f, -0.522f, 0.581f)
                curveToRelative(-0.184f, 0.349f, -4.391f, 8.648f, -4.569f, 8.987f)
                arcToRelative(2.245f, 2.245f, 0.0f, false, false, 4.016f, 1.999f)
                lineToRelative(3.756f, -7.401f)
                close()
                moveTo(23.812f, 8.499f)
                arcToRelative(2.245f, 2.245f, 0.0f, false, false, -1.162f, -2.955f)
                verticalLineToRelative(-0.001f)
                arcToRelative(2.243f, 2.243f, 0.0f, false, false, -0.892f, -0.187f)
                lineToRelative(-0.003f, -0.011f)
                curveToRelative(-0.816f, 0.0f, -1.569f, 0.443f, -1.965f, 1.157f)
                lineToRelative(-3.749f, 7.414f)
                lineToRelative(1.689f, 3.323f)
                curveToRelative(0.213f, 0.399f, 0.59f, 0.664f, 0.998f, 0.839f)
                curveToRelative(0.252f, -0.2f, 0.473f, -0.444f, 0.605f, -0.742f)
                lineToRelative(4.479f, -8.837f)
                close()
            }
        }
        .build()
        return _namecheap!!
    }

private var _namecheap: ImageVector? = null
