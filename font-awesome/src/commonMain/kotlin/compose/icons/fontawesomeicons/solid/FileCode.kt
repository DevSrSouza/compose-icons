package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FileCode: ImageVector
    get() {
        if (_fileCode != null) {
            return _fileCode!!
        }
        _fileCode = Builder(name = "FileCode", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 121.941f)
                lineTo(384.0f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                horizontalLineToRelative(6.059f)
                curveToRelative(6.365f, 0.0f, 12.47f, 2.529f, 16.971f, 7.029f)
                lineToRelative(97.941f, 97.941f)
                arcTo(24.005f, 24.005f, 0.0f, false, true, 384.0f, 121.941f)
                close()
                moveTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.745f, 0.0f, 0.0f, 10.745f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                close()
                moveTo(123.206f, 400.505f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -7.633f, 0.246f)
                lineToRelative(-64.866f, -60.812f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.0f, -7.879f)
                lineToRelative(64.866f, -60.812f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 7.633f, 0.246f)
                lineToRelative(19.579f, 20.885f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.372f, 7.747f)
                lineTo(101.65f, 336.0f)
                lineToRelative(40.763f, 35.874f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.372f, 7.747f)
                lineToRelative(-19.579f, 20.884f)
                close()
                moveTo(174.501f, 450.984f)
                lineToRelative(-27.453f, -7.97f)
                arcToRelative(5.402f, 5.402f, 0.0f, false, true, -3.681f, -6.692f)
                lineToRelative(61.44f, -211.626f)
                arcToRelative(5.402f, 5.402f, 0.0f, false, true, 6.692f, -3.681f)
                lineToRelative(27.452f, 7.97f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 3.68f, 6.692f)
                lineToRelative(-61.44f, 211.626f)
                arcToRelative(5.397f, 5.397f, 0.0f, false, true, -6.69f, 3.681f)
                close()
                moveTo(335.293f, 339.939f)
                lineToRelative(-64.866f, 60.812f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -7.633f, -0.246f)
                lineToRelative(-19.58f, -20.885f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.372f, -7.747f)
                lineTo(284.35f, 336.0f)
                lineToRelative(-40.763f, -35.874f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.372f, -7.747f)
                lineToRelative(19.58f, -20.885f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 7.633f, -0.246f)
                lineToRelative(64.866f, 60.812f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.001f, 7.879f)
                close()
            }
        }
        .build()
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
