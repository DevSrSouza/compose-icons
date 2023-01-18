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

public val IonIcons.GitBranchSharp: ImageVector
    get() {
        if (_gitBranchSharp != null) {
            return _gitBranchSharp!!
        }
        _gitBranchSharp = Builder(name = "GitBranchSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -58.86f, 89.11f)
                lineTo(192.0f, 273.11f)
                lineTo(192.0f, 151.39f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -64.0f, 0.0f)
                lineTo(128.0f, 360.61f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 0.0f)
                lineTo(192.0f, 358.0f)
                lineTo(346.25f, 223.73f)
                curveToRelative(1.9f, 0.17f, 3.81f, 0.27f, 5.75f, 0.27f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, -128.0f)
                close()
                moveTo(160.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 64.0f)
                close()
                moveTo(160.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 448.0f)
                close()
                moveTo(352.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 352.0f, 192.0f)
                close()
            }
        }
        .build()
        return _gitBranchSharp!!
    }

private var _gitBranchSharp: ImageVector? = null
