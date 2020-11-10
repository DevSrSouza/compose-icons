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

public val SimpleIcons.Nutanix: VectorAsset
    get() {
        if (_nutanix != null) {
            return _nutanix!!
        }
        _nutanix = VectorAssetBuilder(name = "Nutanix", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.393f, 3.617f)
                arcTo(0.395f, 0.395f, 0.0f, false, false, 0.0f, 4.012f)
                curveToRelative(0.0f, 0.12f, 0.054f, 0.225f, 0.139f, 0.297f)
                lineToRelative(8.507f, 7.404f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, -0.013f, 0.588f)
                lineToRelative(-8.52f, 7.412f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, false, 0.28f, 0.67f)
                horizontalLineToRelative(4.86f)
                curveToRelative(0.103f, 0.0f, 0.195f, -0.04f, 0.265f, -0.104f)
                lineToRelative(9.17f, -7.98f)
                arcToRelative(0.396f, 0.396f, 0.0f, false, false, 0.001f, -0.596f)
                lineTo(5.518f, 3.721f)
                arcToRelative(0.386f, 0.386f, 0.0f, false, false, -0.264f, -0.104f)
                lineTo(0.393f, 3.617f)
                close()
                moveTo(18.752f, 3.617f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, false, -0.273f, 0.113f)
                lineToRelative(-4.717f, 4.106f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, false, -0.04f, 0.564f)
                lineToRelative(2.428f, 2.114f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, false, 0.291f, 0.129f)
                arcToRelative(0.394f, 0.394f, 0.0f, false, false, 0.278f, -0.118f)
                lineToRelative(7.127f, -6.203f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, false, 0.154f, -0.31f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, false, -0.393f, -0.395f)
                horizontalLineToRelative(-4.855f)
                close()
                moveTo(16.442f, 13.359f)
                curveToRelative(-0.116f, 0.0f, -0.22f, 0.05f, -0.292f, 0.13f)
                lineToRelative(-2.427f, 2.113f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, false, 0.039f, 0.564f)
                lineToRelative(4.717f, 4.104f)
                curveToRelative(0.07f, 0.07f, 0.166f, 0.113f, 0.273f, 0.113f)
                horizontalLineToRelative(4.855f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, false, 0.239f, -0.705f)
                lineToRelative(-7.127f, -6.203f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, false, -0.278f, -0.116f)
                close()
            }
        }
        .build()
        return _nutanix!!
    }

private var _nutanix: VectorAsset? = null
